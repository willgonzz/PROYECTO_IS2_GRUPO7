import './globals.css'
import { Inter } from 'next/font/google'
// add bootstrap css 
import 'bootstrap/dist/css/bootstrap.css'
// add fontAwesome
import "@fortawesome/fontawesome-svg-core/styles.css";
import { config } from "@fortawesome/fontawesome-svg-core";
config.autoAddCss = false;

const inter = Inter({ subsets: ['latin'] })

export const metadata = {
  title: 'PoliBlog',
  description: 'IS2',
}

export default function RootLayout({ children }) {
  return (
    <html lang="en">
      <body className="bg-dark">{children}</body>
    </html>
  )
}
